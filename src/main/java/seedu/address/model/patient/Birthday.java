package seedu.address.model.patient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class Birthday {
    public static final String MESSAGE_CONSTRAINTS =
            "Birth dates should only contain numbers in valid dd/MM/yyyy format";
    public static final String VALIDATION_REGEX = "\\d{1,2}\\/\\d{1,2}\\/\\d{2,4}";
    public final LocalDate value;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Birthday(String birthdate) {
        requireNonNull(birthdate);
        checkArgument(isValidBirthdate(birthdate), MESSAGE_CONSTRAINTS);
        value = LocalDate.parse(birthdate, formatter);
    }

    public static boolean isValidBirthdate(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Birthday)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        Birthday otherDate = (Birthday) other;
        return value.equals(otherDate.value);
    }
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
