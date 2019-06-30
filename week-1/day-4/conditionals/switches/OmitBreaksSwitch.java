// Omit breaks within multiple cases to display additional information

public class OmitBreaksSwitch {
    public static void main(String[] args) {
        int month = 1;
        String monthType;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
        }
        switch (month) {
            case 12:
            case 1:
            case 2:
                monthType = "Winter";
                break;
            case 3: 
            case 4:
            case 5:
                monthType = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                monthType = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                monthType = "Autumn";
                break;

            default:
                monthType = "Invalid monthType";
        }
        System.out.println(monthString + " is in the " + monthType);
    }
}