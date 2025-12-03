package controller

import model.TaskSchedulerModel
import view.TaskSchedulerUi

class TaskSchedulerController(val model: TaskSchedulerModel, val view: TaskSchedulerUi) {
    init {
        view.new_taskButton.setOnActionClickListener {
            // Lancer la procédure d'ajout d'une nouvelle tâche
        }
    }
}