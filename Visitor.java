import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Visitor {
    // variables declaration
    private String title;
    private String firstName;
    private String lastName;
    private int age;
    private int membershipID;
    // adding a static counter
    private static int nextID = 1; // initialize with 1
    private MembershipType membershipType;
    private int durationMonth;
    private LocalDate startDate;
    private LocalDateTime visitDateTime;

    // object constructor
    public Visitor(String title, String firstName, String lastName, int age, LocalDate startDate) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.membershipID = nextID++;
        this.startDate = startDate;
        // adding default membership to NONE:
        this.membershipType = MembershipType.NONE;
    }

    // adding getters
    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getMembershipID() {
        return membershipID;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public int getDurationMonth() {
        return durationMonth;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDateTime getVisitDateTime() {
        return visitDateTime;
    }

    // setter for visitDateTime
    public void setVisitDateTime(LocalDateTime visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    // // subscribe method
    // public void subscribe(MembershipType newMembershipType, int durationMonth){
    // this.membershipType = newMembershipType;
    // this.durationMonth = durationMonth;
    // }

    // //adding setter to renew the subscription
    // public void setStartDate(LocalDate startDate){
    // this.startDate = startDate;
    // }
    // public void setDurationMonth(int durationMonth){
    // this.durationMonth = durationMonth;
    // }
    // public void setMemberShipType(MembershipType membershipType){
    // this.membershipType = membershipType;
    // }

    // //renew method
    // public void renew(LocalDate renewalDate, int durationMonth, MembershipType
    // newMembershipType){
    // setStartDate(renewalDate);
    // setDurationMonth(durationMonth);
    // setMemberShipType(newMembershipType);
    // }

    // feeCalculation abstract method
    public abstract double feeCalculation();
}
