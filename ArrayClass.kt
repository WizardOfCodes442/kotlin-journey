class ArrayClass {
    //Learning to create Array from scratch

    fun tileColors(): Array<Array<Int>> {
        val shades = Array(2) {
            Array (2) {0}
        }

        shades[0][0] = 192
        shades[0][1] = 128
        shades[1][0] = 64
        shades[1][1] = 0
        return shades
    }

    fun tileColors(): Array<Array<Int>> {
        val shades = Array(3) {
            Array(3) {0}
        }
        shades[0][1] = 255
        shades[0][1] = 255
        shades[0][2] = 0
        shades[1][0] = 255
        shades[1][1] = 0
        shades[1][2] = 0
        shades[2][0] = 0
        shades[2][1] = 0
        shades[2][2] = 0

        return shades
    }

    //Using loops to automate cell operation
    //loops body sets the color of the cell
    //corresponding to the column

    fun tileColorsLoop(): Array<Array<Int>> {
        val shades = Array(5) {
            Array(5) {0}
        }
        //Set each cell  in row 0 to be black
        for (col in 0..4) {
            shades[0][col] = 0
        }
        //Row 1 is dark gray
        for (col in 0..4) {
            shades[1][col] = 65
        }
        //Row 2 is gray
        for (col in 0..4) {
            shades[2][col] = 130
        }
        //Row 3 is light gray
        for (col in 0..4) {
            shades[3][col] = 195
        }
        //Row 4 is white
        for (col in 0..4) {
            shades[4][col] = 255
        }
        return shades
    }

    //Suppose we wanted to give all of the tiles
    // in a pattern thesame color
    //To do this, we could have a series
    //of nearly identical loops, one for each row
    //A better approach is to loop over the rows
    //and for the body of the loop have another loop

    fun tileColors(): Array<Array<Int>> {
        val shades = Array(5) {
            Array(5) {0}
        }

        for (row in 0..4) {
            for (col in 0..4) {
                shades[row][col] = 255
            }
        }
        return shades
    }

    fun tileColors(): Array<Array<Int>> {
        val shades = Array(5) {
            Array<Int> {0}
        }
        //Set each cell in row 0 to be black 
        for (col in 0..4) {
            shades[0][col] = 0
        }
        //Row 1 is white
        for (col in 0..4) {
            shades[1][col] = 255
        }
        //Row 2 is black
        for (col in 0..4) {
            shades[2][col] = 0
        }
        //Row 3 is white
        for (col in 0..4) {
            shades[3][col] = 255
        }
        //Row 4 is black
        for (col in 0..4) {
            shades[4][col] =0
        }
        return shades
    }

    fun tileColorsSol(): Array<Array<Int>> {
        val shades = Array(5) {
            Array(5) {0}
        }
        for (row in 0..4) {
            for (col in 0..4) {
                shades[row][col] = 128
            }
        }
    }


}