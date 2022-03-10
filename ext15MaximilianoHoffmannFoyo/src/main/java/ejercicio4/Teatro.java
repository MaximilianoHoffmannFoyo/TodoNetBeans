package ejercicio4;

/*
 */
public class Teatro {

    private char[][] asientos;

    public Teatro(int filas, int columnas) {
        this.asientos = new char[filas][columnas];
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (i == 0 || j == 0) {
                    asientos[i][j] = ' ';
                } else if ((i % 2) == 0 || (j % 2) == 0) {
                    asientos[i][j] = 'X';
                } else {
                    asientos[i][j] = 'L';
                }
            }
        }
    }

    public void reservarAsiento(int fila, int columna) {
        if ((fila > 0 && columna > 0) && (fila < this.asientos.length && columna < this.asientos[1].length)) {
            if (asientos[fila][columna] != 'V' && asientos[fila][columna] != 'X') {
                asientos[fila][columna] = 'V';
            }
        }
    }

    public void cancelarReservaAsiento(int fila, int columna) {
        if ((fila > 0 && columna > 0) && (fila < this.asientos.length && columna < this.asientos[1].length)) {
            if (asientos[fila][columna] != 'L' && asientos[fila][columna] != 'X') {
                asientos[fila][columna] = 'L';
            }
        }
    }

    public void imprimirTeatro() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}
