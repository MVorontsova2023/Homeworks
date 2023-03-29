package sea_battle;

import java.util.Scanner;

public class Seabattle {

   private static Player [] players = new Player[2];
    public static void main(String[] args)
    {
        // Создание игроков
        createPlayers();
        // Заполнение полей игроков
        fillPlayerFields();
//        fillMockField();
        // Старт игры
        boolean isFirstPlayerActive = true;
        boolean isGameOver = false;
        while (isGameOver == false) {
            boolean isShotSuccessfull = true;
            do {
                isShotSuccessfull = Shot(isFirstPlayerActive);
                isGameOver = CheckGameOver(isFirstPlayerActive);
            }
            while (isShotSuccessfull && (isGameOver == false));

            if (isGameOver == false) {
                isFirstPlayerActive = !isFirstPlayerActive;
            }
        }
        // Вывод результатов
        PrintResults(isFirstPlayerActive);
    }

    private static void fillMockField() {
        for (Player player: players) {
            player.fillMockGameField();
        }
    }

    private static void PrintResults(boolean isFirstPlayerActive) {
        if (isFirstPlayerActive) {
            System.out.printf("Игрок %s, выиграл\n", players[0].getName());
            players[1].printField();
        }
        else {
            System.out.printf("Игрок %s, выиграл\n", players[1].getName());
            players[0].printField();
        }
        System.out.println("The end of game");
    }

    private static boolean CheckGameOver(boolean isFirstPlayerActive) {
        boolean isGameOver = false;

        if (isFirstPlayerActive) {
            isGameOver = players[1].isGameOver();
        }
        else {
            isGameOver= players[0].isGameOver();
        }

        return isGameOver;
    }

    private static boolean Shot(boolean isFirstPlayerActive) {
        Scanner scanner = new Scanner((System.in));
        if (isFirstPlayerActive) {
            System.out.printf("Игрок %s, делаем выстрел:", players[0].getName());
        }
        else {
            System.out.printf("Игрок %s, делаем выстрел:", players[1].getName());
        }

        System.out.println("Введите ряд");
        int inputtedRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите столбец");
        int inputtedColumn = Integer.parseInt(scanner.nextLine());

        boolean isShotSuccessfull = false;

        if (isFirstPlayerActive) {
            isShotSuccessfull = players[1].Shot(inputtedRow, inputtedColumn);
        }
        else {
            isShotSuccessfull= players[0].Shot(inputtedRow, inputtedColumn);
        }
        return isShotSuccessfull;
    }


    private static void createPlayers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Морской бой.");
        System.out.println("Игрок 1, введите своё имя.");
        String name = scanner.nextLine();
        players[0] = new Player(name);

        System.out.println("Игрок 2, введите своё имя.");
        name = scanner.nextLine();
        players[1] = new Player(name);

    }
    private static void fillPlayerFields() {
        for (Player player: players) {
            player.fillGameField();
        }
    }
}

