package com.conway.game

import org.specs2.mutable._

/*
Rules:

The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells,
each of which is in one of two possible states, live or dead.
Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent.

Any live cell with two or three live neighbours survives
Any dead cell with three live neighbours becomes a live cell
All other live cells die in the next generation. Similarly, all other dead cells stay dead

The initial pattern constitutes the seed of the system.
The first generation is created by applying the above rules simultaneously to every cell in the seed;
births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick.
Each generation is a pure function of the preceding one. The rules continue to be applied repeatedly to create further generations.

*/

class GameOfLifeTest extends SpecificationWithJUnit {

  "GameOfLife" should {
    "change me ! to be the first test out of many" in {
      ok
    }
  }
}