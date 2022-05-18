package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AventuraDAO implements IAventura {

    private Connection con = null;

    public AventuraDAO() {
        con = Conexion.getInstance();
    }

    @Override
    public List<AventuraVO> getAll() throws SQLException {
        List<AventuraVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from aventura");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                AventuraVO p = new AventuraVO();
                // Recogemos los datos de la aventura, guardamos en un objeto
                p.setCodAventura(res.getInt("codAventura"));
                p.setNombre(res.getString("nombre"));
                p.setDificultad(res.getString("dificultad"));
                p.setDescripcion(res.getString("descripcion"));

                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }

        return lista;
    }

    @Override
    public AventuraVO findByCodAventura(int codAventura) throws SQLException {

        ResultSet res = null;
        AventuraVO aventura = new AventuraVO();

        String sql = "select * from aventura where codAventura=?";

        try ( PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, codAventura);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe ese codAventura
            if (res.next()) {
                // Recogemos los datos de la aventura, guardamos en un objeto
                aventura.setCodAventura(res.getInt("codAventura"));
                aventura.setNombre(res.getString("nombre"));
                aventura.setDificultad(res.getString("dificultad"));
                aventura.setDescripcion(res.getString("descripcion"));
                return aventura;
            }

            return null;
        }
    }

    @Override
    public int insertAventura(AventuraVO aventura) throws SQLException {

        int numFilas = 0;
        String sql = "insert into aventura values (?,?,?,?)";

        if (findByCodAventura(aventura.getCodAventura()) != null) {
            // Existe un registro con ese codAventura
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(1, aventura.getCodAventura());
                prest.setString(2, aventura.getNombre());
                prest.setString(3, aventura.getDificultad());
                prest.setString(4, aventura.getDescripcion());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertAventura(List<AventuraVO> lista) throws SQLException {
        int numFilas = 0;

        for (AventuraVO tmp : lista) {
            numFilas += insertAventura(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteAventura() throws SQLException {

        String sql = "delete from aventura";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;

    }

    @Override
    public int deleteAventura(AventuraVO aventura) throws SQLException {
        int numFilas = 0;

        String sql = "delete from aventura where codAventura = ?";

        // Sentencia parametrizada
        try ( PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, aventura.getCodAventura());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updateAventura(int codAventura, AventuraVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update aventura set nombre = ?, dificultad = ?, descripcion = ? where codAventura=?";

        if (findByCodAventura(codAventura) == null) {
            // La aventura a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, nuevosDatos.getNombre());
                prest.setString(2, nuevosDatos.getDificultad());
                prest.setString(3, nuevosDatos.getDescripcion());
                prest.setInt(4, codAventura);

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    public int cambiarNombres(String newName, String oldName) throws SQLException {

        int res = 0;
        // Dos ?, uno para newName y otro para oldName

        String sql = "{call cambiar_nombres (?,?)}";

        // Preparamos la llamada al procedimiento almacenado
        try ( CallableStatement call = con.prepareCall(sql)) {
            // Establecemos parámetros a pasar al procedimiento
            call.setString(1, newName);
            call.setString(2, oldName);
            // Ejecutamos el procedimiento
            res = call.executeUpdate();

        }
        return res;
    }

}
