package sea_battle;

import java.util.Scanner;

public class Player {
    private  String name;
    private  char [][] field;
    private int fieldSize = 10;
//    private int [][] descShipAmount = {{3,1}};
//    private int [][] descShipAmount = {{2,1},{1,1}};
    private int [][] descShipAmount = {{4,1},{3,2},{2,3},{1,4}};
    private char emptyCell = '.';
    private char valueForShip = 'O';

    private char shottedCell = '+';

    private char missedCell = '-';

    private boolean isAlive = true;

    public Player(String name){
        this.name =name;
        this.field = new char[fieldSize][fieldSize];
        initialFill();
    }
    public String getName() {
        return name;
    }

    public char[][] getField() {
        return field;
    }

    @Override
    public String toString() {
        return name;
    }

    private void initialFill() {
        for(int i =0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = emptyCell;
            }
        }
    }

    public void printField() {
        for (char[] row: field) {
            for (char cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void fillGameField() {
        Scanner scanner = new Scanner((System.in));
        for(int[] row: descShipAmount) {
            int decks = row[0];
            int ships = row[1];

            for (int i = 0; i < ships; i++) {
                System.out.printf("%s, разместите корабль на %d палубы.\n", name, decks);
                System.out.println("Введите ряд");
                int inputtedRow = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите столбец");
                int inputtedColumn = Integer.parseInt(scanner.nextLine());
                System.out.println("Выберите расположение: 1 - горизонтальное, 2 - вертикальное.");
                int direction = Integer.parseInt(scanner.nextLine());

                // проверка корректности координат
                boolean isCorrect = isCoordinatesCorrect(inputtedRow, inputtedColumn, direction,decks);
                // В зависимости от результата либо размещать корабль
                // либо заставить игрока повторить ввод координат
                if (isCorrect) {
                    placeShip(inputtedRow, inputtedColumn, direction,decks);
                    printField();
                }
                else {
                    System.out.println("Извините, но место уже занято другим кораблем. Введите другие координаты");
                    i--;
                }
            }
        }
    }

    private void placeShip(int x, int y, int direction, int decks) {
        for (int i = 0; i < decks; i++) {
            field[x][y] = valueForShip;
            if (direction == 1) {
                y++;
            }
            else {
                x++;
            }
        }
    }

    private boolean isCoordinatesCorrect (int x, int y, int direction, int decks) {
        // Вернуть true , если координаты корректны,
        // то есть корабль не пересекается и не соприкосается
        // и не выходит за пределы поля
        // иначе вернуть false

        boolean isValid = true;

        // Проверяем, что корабль не выходит за пределы поля
        if (direction == 1) {
            if (y + decks > fieldSize) {
                isValid = false;
            }
        } else {
            if (x + decks > fieldSize) {
                isValid = false;
            }
        }

        // Проверяем, что корабль не пересекается с другими кораблями
        // и между кораблями есть расстояние не менее одной клетки
        if (isValid) {
            if (direction == 1) {

                for (int i = y; i < y + decks; i++) {
                    if (field[x][i] == valueForShip ||
                        (x > 0 && field[x-1][i] == valueForShip) ||
                        ((x < fieldSize-1) && field[x+1][i] == valueForShip)) {
                        isValid = false;
                        break;
                    }
                }

                if (y > 0 && field[x][y-1] == valueForShip) isValid = false;
                if ((y+decks < fieldSize) && field[x][y+decks] == valueForShip) isValid = false;

                if (x > 0 && y > 0 && field[x-1][y-1] == valueForShip) isValid = false;
                if (x > 0 && (y+decks < fieldSize) && field[x-1][y+decks] == valueForShip) isValid = false;
                if ((x < fieldSize-1) && y > 0 && field[x+1][y-1] == valueForShip) isValid = false;
                if ((x < fieldSize-1) && (y+decks < fieldSize) && field[x+1][y+decks] == valueForShip) isValid = false;
            } else  {

                for (int i = x; i < x + decks; i++) {
                    if (field[i][y] == valueForShip ||
                            (y > 0 && field[i][y-1] == valueForShip) ||
                            ((y < fieldSize-1)  && field[i][y+1] == valueForShip)) {
                        isValid = false;
                        break;
                    }
                }

                if (x > 0 && field[x-1][y] == valueForShip) isValid = false;
                if ((x+decks < fieldSize) && field[x+decks][y] == valueForShip) isValid = false;

                if (y > 0 &&  x > 0 && field[x-1][y-1] == valueForShip) isValid = false;
                if (y > 0 && (x+decks < fieldSize) && field[x+decks][y-1] == valueForShip) isValid = false;
                if ((y < fieldSize-1) && x > 0 && field[x-1][y+1] == valueForShip) isValid = false;
                if ((y < fieldSize-1) && (x+decks < fieldSize) && field[x+decks][y+1] == valueForShip) isValid = false;
            }
        }
        return isValid;
    }

    public void fillMockGameField() {
        field[1][1] = valueForShip;
        field[1][2] = valueForShip;
        field[1][3] = valueForShip;
    }

    public boolean Shot(int inputtedRow, int inputtedColumn) {
        boolean isShotSuccessfull = false;

        if (field[inputtedRow][inputtedColumn] == valueForShip) {
            field[inputtedRow][inputtedColumn] = shottedCell;

            if (isKilled(inputtedRow,inputtedColumn)) {
                System.out.println("Убит");
            }
            else {
                System.out.println("Ранен");
            }

            isShotSuccessfull = true;
        }
        else {
            field[inputtedRow][inputtedColumn] = missedCell;
        }
//        printField();

        return isShotSuccessfull;
    }

    private boolean isKilled(int inputtedRow, int inputtedColumn) {
        boolean isKill = true;
        if (inputtedRow > 0 && field[inputtedRow - 1][inputtedColumn] == valueForShip) isKill = false;
        if ((inputtedRow < fieldSize-1) && field[inputtedRow + 1][inputtedColumn] == valueForShip) isKill = false;
        if (inputtedColumn > 0 && field[inputtedRow][inputtedColumn - 1] == valueForShip) isKill = false;
        if ((inputtedColumn < fieldSize-1) && field[inputtedRow][inputtedColumn + 1] == valueForShip) isKill = false;

        return isKill;
    }

    public boolean isGameOver() {
        boolean gameover = true;
        for(int i =0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (field[i][j] == valueForShip) {
                    gameover = false;
                    break;
                }
            }
        }
        return gameover;
    }
}
