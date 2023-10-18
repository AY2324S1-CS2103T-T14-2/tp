package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_BIRTHDAY_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_BIRTHDAY_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GENDER_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GENDER_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.patient.Patient;

/**
 * A utility class containing a list of {@code Patient} objects to be used in tests.
 */
public class TypicalPatients {

    public static final Patient ALICE = new PatientBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends")
            .withBirthday("12/03/2001")
            .withGender("FEMALE")
            .withIcNumber("T1234567N").build();
    public static final Patient BENSON = new PatientBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends")
            .withBirthday("11/11/2007")
            .withGender("MALE")
            .withIcNumber("T7654321A")
            .build();
    public static final Patient CARL = new PatientBuilder().withName("Carl Kurz")
            .withAddress("wall street")
            .withEmail("heinz@example.com").withPhone("95352563")
            .withTags("friends")
            .withBirthday("08/08/2008")
            .withGender("MALE")
            .withIcNumber("S1237654A")
            .build();
    public static final Patient DANIEL = new PatientBuilder().withName("Daniel Meier")
            .withAddress("10th street")
            .withEmail("cornelia@example.com").withPhone("87652533")
            .withTags("friends")
            .withBirthday("09/09/2009")
            .withGender("MALE")
            .withIcNumber("S7246812A")
            .build();
    public static final Patient ELLE = new PatientBuilder().withName("Elle Meyer")
            .withAddress("michegan ave")
            .withEmail("werner@example.com").withPhone("94823224")
            .withTags("owesMoney")
            .withBirthday("10/10/2010")
            .withGender("FEMALE")
            .withIcNumber("T2468123N")
            .build();
    public static final Patient FIONA = new PatientBuilder().withName("Fiona Kunz")
            .withAddress("little tokyo")
            .withEmail("lydia@example.com").withPhone("94824270")
            .withTags("friends")
            .withBirthday("03/03/2003")
            .withGender("FEMALE")
            .withIcNumber("T1234321C")
            .build();
    public static final Patient GEORGE = new PatientBuilder().withName("George Best")
            .withAddress("4th street")
            .withEmail("anna@example.com").withPhone("9482442")
            .withBirthday("04/04/2004")
            .withGender("MALE")
            .withIcNumber("S1234567A")
            .build();

    // Manually added
    public static final Patient HOON = new PatientBuilder().withName("Hoon Meier")
            .withAddress("little india")
            .withEmail("stefan@example.com").withPhone("8482424")
            .withBirthday("07/09/2009")
            .withGender("MALE")
            .withIcNumber("S4682451A")
            .build();
    public static final Patient IDA = new PatientBuilder().withName("Ida Mueller")
            .withAddress("chicago ave")
            .withEmail("hans@example.com").withPhone("8482131")
            .withBirthday("01/02/2003")
            .withGender("FEMALE")
            .withIcNumber("S1234567A")
            .build();

    // Manually added - Patient's details found in {@code CommandTestUtil}
    public static final Patient AMY = new PatientBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND)
            .withGender(VALID_GENDER_AMY).withBirthday(VALID_BIRTHDAY_AMY).build();
    public static final Patient BOB = new PatientBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .withGender(VALID_GENDER_BOB).withBirthday(VALID_BIRTHDAY_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPatients() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical patients.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Patient patient : getTypicalPatients()) {
            ab.addPatient(patient);
        }
        return ab;
    }

    public static List<Patient> getTypicalPatients() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
