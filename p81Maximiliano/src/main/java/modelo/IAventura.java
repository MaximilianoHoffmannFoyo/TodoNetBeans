package daw.carlos.modelo;

import java.sql.SQLException;
import java.util.List;

public interface IAventura {

    // Método para obtener todos los registros de la tabla
    List<AventuraVO> getAll() throws SQLException;

    // Méodo para obtener un registro a partir de la PK
    AventuraVO findByCodAventura(int codAventura) throws SQLException;

    // Método para insertar un registro
    int insertAventura(AventuraVO aventura) throws SQLException;

    // Método para insertar varios registros
    int insertAventura(List<AventuraVO> lista) throws SQLException;

    // Método para borrar una aventura
    int deleteAventura(AventuraVO p) throws SQLException;

    // Método para borrar toda la tabla
    int deleteAventura() throws SQLException;

    // Método para modificar una aventura. Se modifica a la aventura que tenga esa 'pk'
    // con los nuevos datos que traiga la aventura 'nuevosDatos'
    int updateAventura(int pk, AventuraVO nuevosDatos) throws SQLException;

}
