package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.Messages.MESSAGE_PATIENT_LISTED_SUCCESS;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.Model;
import seedu.address.model.patient.IcNumber;
import seedu.address.model.patient.PatientWithIcNumberPredicate;
import seedu.address.model.patient.exceptions.PatientWithFieldNotFoundException;

/**
 * Views the Patient with a certain {@Code IcNumber}
 */
public class ViewCommand extends Command {

    public static final String COMMAND_WORD = "view";

    public static final String MESSAGE_USAGE =
        COMMAND_WORD + ": View the Patient with IcNumber\n" + "Parameters: IC_NUMBER\n" + "Example: " + COMMAND_WORD
            + " t1234567j";

    private final PatientWithIcNumberPredicate predicate;
    private final IcNumber icNumberToFind;

    public ViewCommand(PatientWithIcNumberPredicate predicate, IcNumber icNumberToFind) {
        this.predicate = predicate;
        this.icNumberToFind = icNumberToFind;
    }

    @Override
    public CommandResult execute(Model model) throws PatientWithFieldNotFoundException {
        requireNonNull(model);
        model.updateFilteredPatientList(predicate);
        if (model.getFilteredPatientList().size() == 0) { // no patient with that IC
            throw new PatientWithFieldNotFoundException("Ic Number : " + icNumberToFind.value);
        }
        return new CommandResult(MESSAGE_PATIENT_LISTED_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof ViewCommand)) {
            return false;
        }

        ViewCommand otherViewCommand = (ViewCommand) other;
        return predicate.equals(otherViewCommand.predicate);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).add("predicate", predicate).toString();
    }
}
