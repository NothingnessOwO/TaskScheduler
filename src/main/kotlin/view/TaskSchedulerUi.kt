package view

import com.sun.tools.javac.util.JCDiagnostic
import javafx.collections.FXCollections
import javafx.scene.control.Button
import javafx.scene.layout.GridPane
import javafx.scene.paint.Color
import model.TaskSchedulerModel

class View: GridPane() {
    private val tabButton: ArrayList<Button>

    init {
        val labelsButton = arrayOf("New task", "Update task", "Delete task")
        this.textField = TextField("Task Scheduler")
        this.textField.setPrefSize(10.0, 50.0)

        this.tabButton = ArrayList<Button>(3)

        // Création des boutons qui s'occupent des tâches
        for (i in 0..<labelsButton.size) {
            val button = Button(labelsButton[i])
            button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE)
            button.textFill = Color.BLUEVIOLET
            this.tabButton.add(button)
        }

        // Ajout des boutons dans le gridpane
        this.add(textfield)
        this.addRow(1, tabButton[0], tabButton[1], tabButton[2])

        // Mise en place des contraintes sur les lignes et colonnes du gridpane
        // A continuer
    }
}