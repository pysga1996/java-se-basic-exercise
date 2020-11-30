package com.basic.sample.ex7;

import common.Exercise;

public class MineSweeperMap implements Exercise {

    @Override
    public void start() {
        String[][] map = {
            {"*", ".", ".", "."},
            {".", ".", ".", "."},
            {".", "*", ".", "."},
            {".", ".", ".", "."}
        };
        for (String[] yOrdinate : map) {
            for (String xOrdinate : yOrdinate) {
                System.out.print(xOrdinate);
            }
            System.out.println();
        }
        System.out.println();

        final int MAP_HEIGHT = map.length;
        final int MAP_WIDTH = map[0].length;

        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
        for (int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++) {
            for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
                String currentCell = map[yOrdinate][xOrdinate];
                if (currentCell.equals("*")) {
                    mapReport[yOrdinate][xOrdinate] = "*";
                } else {
                    final int[][] NEIGHBOURS_ORDINATE = {
                        {yOrdinate - 1, xOrdinate - 1}, {yOrdinate - 1, xOrdinate},
                        {yOrdinate - 1, xOrdinate + 1},
                        {yOrdinate, xOrdinate - 1}, {yOrdinate, xOrdinate + 1},
                        {yOrdinate + 1, xOrdinate - 1}, {yOrdinate + 1, xOrdinate},
                        {yOrdinate + 1, xOrdinate + 1},
                    };

                    int minesAround = 0;
                    for (int[] NEIGHBOURS_ORDINATE_ELEMENT : NEIGHBOURS_ORDINATE) {
                        int xOrdinateOfNeighbour = NEIGHBOURS_ORDINATE_ELEMENT[1];
                        int yOrdinateOfNeighbour = NEIGHBOURS_ORDINATE_ELEMENT[0];

                        boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0
                            || xOrdinateOfNeighbour == MAP_WIDTH
                            || yOrdinateOfNeighbour < 0
                            || yOrdinateOfNeighbour == MAP_HEIGHT;
                        if (isOutOfMapNeighbour) {
                            continue;
                        }

                        boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour]
                            .equals("*");
                        if (isMineOwnerNeighbour) {
                            minesAround++;
                        }
                    }

                    mapReport[yOrdinate][xOrdinate] = String.valueOf(minesAround);
                }
            }
        }
        for (int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++) {
            for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
                String currentCellReport = mapReport[yOrdinate][xOrdinate];
                System.out.print(currentCellReport);
            }
            System.out.println();
        }
    }
}
