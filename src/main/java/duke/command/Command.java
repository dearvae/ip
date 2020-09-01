package duke.command;

import duke.task.TaskList;
import duke.utils.Ui;

public abstract class Command {
    public abstract  boolean isExit();
    public abstract void execute(TaskList tasks, Ui ui);
}