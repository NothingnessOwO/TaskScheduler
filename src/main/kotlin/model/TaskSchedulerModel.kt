package model

import javafx.collections.FXCollections
import javafx.collections.ObservableList

data class Task(var description: String, var done: Boolean = false) {

}

class TaskSchedulerModel() {
    val tasks = FXCollections.observableArrayList<Task>()
}