package lpk.basics

import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main() {
    SwingUtiites.invokeLater {FirstProgram().doLaunch()}
}

class FirstProgram {
    fun tileColors(): Array<Array<Int>> {
        return arrayOf(
            arrayOf(0, 255),
            arrayOf(255, 0)
        )
    }

    //now we are adding different patterns via tileColor series

    //modify1

    fun titleColorsrev() : Array<Array<Int>> {
        return arrayOf(
            arrayOf(255, 0)
            arrayOf(0, 255)
        )
    }

    fun  tileColors2(): Array<Array<Int>> {
        return arrayOf(
            arrayOf(0,0)
            arrayOf(0,255)
        )
    }

    fun tileColors3b3() : Array<Array<Int>> {
        return arrayOf(
            arrayOf(0, 255, 0),
            arrayOf(255, 0, 255),
            arrayOf(0, 255, 0)
        )
    }

    fun tileColorsdiff() : Array<Array<Int>> {
        return arrayOf(
            arrayOf(0, 64),
            arrayOf(128, 192)
        )
    }

    fun doLaunch() {
        val frame = JFrame("Basics")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.iconImage = ImageIcon("./src/lpk/basics/icon.png").image
        frame.add(TilePanel(tileColors()))
        frame.pack()
        frame.isVisible = true
    }
}