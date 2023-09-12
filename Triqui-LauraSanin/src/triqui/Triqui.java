package triqui;

import java.util.Scanner;

public class Triqui {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[][] triqui = new int[3][3];
        int valor = 0;
        int intentosA = 0;
        int a, b, c, d, fin = 0;
        for (int i = 0; i < triqui.length; i++) {
            for (int j = 0; j < triqui.length; j++) {
                if (i < 3) {
                    triqui[i][j] = 0;
                    System.out.print(triqui[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Jugador A = 1");
        System.out.println("Jugador B = 2");
        System.out.println();

        for (int y = 0; y < 5; y++) {
            if (valor == 3) {

            } else {
                if (fin == 5 || intentosA == 5) {
                    System.out.println();
                    System.out.println("Lo sentimos tablero lleno...");
                } else {

                    intentosA = intentosA + 1;

                    System.out.println("-------------------------------");
                    System.out.println("[0][0] [0][1]  [0][2]");
                    System.out.println("[1][0] [1][1]  [1][2]");
                    System.out.println("[2][0] [2][1]  [2][2]");
                    System.out.println("-------------------------------");

                    System.out.println();
                    System.out.println("Jugador A:");
                    System.out.println();
                    do {
                        System.out.print("Ingrese la coordenada a: ");
                        a = num.nextInt();
                        if (a > 2) {

                            System.out.print("coordenada erronea");
                            System.out.println();
                        }
                    } while (a >= 3);
                    do {
                        System.out.print("Ingrese la coordenada b: ");
                        b = num.nextInt();
                        if (b > 2) {

                            System.out.print("coordenada erronea");
                            System.out.println();
                        }
                    } while (b >= 3);
                    System.out.println();
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {


                            if (i == a && j == b) {
                                triqui[i][j] = 1;
                            }
                        }
                    }
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {
                            if (i < 3) {
                                System.out.print(triqui[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    for (int w = 0; w < 1; w++) {
                        c = 0;
                        if (triqui[c][w] == 1) {
                            c++;
                            if (triqui[c][w] == 1) {
                                c++;
                                if (triqui[c][w] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 1; w++) {
                        c = 0;
                        if (triqui[w][c] == 1) {
                            c++;
                            if (triqui[w][c] == 1) {
                                c++;
                                if (triqui[w][c] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        c = 0;
                        if (triqui[c][c] == 1) {
                            c++;
                            if (triqui[c][c] == 1) {
                                c++;
                                if (triqui[c][c] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        c = 0;
                        d = 2;
                        if (triqui[c][d] == 1) {
                            c++;
                            d--;
                            if (triqui[c][d] == 1) {
                                c++;
                                d--;
                                if (triqui[c][d] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                }
                if (fin == 5 || intentosA == 5) {
                    System.out.println();
                    System.out.println("Lo sentimos tablero lleno...");

                } else {
                    System.out.println("-------------------------------");
                    System.out.println("[0][0] [0][1]  [0][2]");
                    System.out.println("[1][0] [1][1]  [1][2]");
                    System.out.println("[2][0] [2][1]  [2][2]");
                    System.out.println("-------------------------------");
                    System.out.println();
                    System.out.println("Jugador B:");
                    System.out.println();

                    do {
                        System.out.print("Ingrese la coordenada a: ");
                        a = num.nextInt();
                        if (a > 2) {

                            System.out.print("coordenada erronea");
                            System.out.println();
                        }
                    } while (a >= 3);
                    do {
                        System.out.print("Ingrese la coordenada b: ");
                        b = num.nextInt();
                        if (b > 2) {

                            System.out.print("coordenada erronea");
                            System.out.println();
                        }
                    } while (b >= 3);
                    System.out.println();
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {

                            if (i == a && j == b) {
                                triqui[i][j] = 2;


                            }


                        }

                    }
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {
                            if (i < 3) {
                                System.out.print(triqui[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    for (int w = 0; w < 3; w++) {
                        c = 0;
                        if (triqui[c][w] == 2) {
                            c++;
                            if (triqui[c][w] == 2) {
                                c++;
                                if (triqui[c][w] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        c = 0;
                        if (triqui[w][c] == 2) {
                            c++;
                            if (triqui[w][c] == 2) {
                                c++;
                                if (triqui[w][c] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        c = 0;
                        if (triqui[c][c] == 2) {
                            c++;
                            if (triqui[c][c] == 2) {
                                c++;
                                if (triqui[c][c] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        c = 0;
                        d = 2;
                        if (triqui[c][d] == 2) {
                            c++;
                            d--;
                            if (triqui[c][d] == 2) {
                                c++;
                                d--;
                                if (triqui[c][d] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.println("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println("...");
        System.out.println();
    }
}