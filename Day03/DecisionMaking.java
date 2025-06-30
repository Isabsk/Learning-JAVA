class DecisionMaking {
    public static void main(String[] args) {
        int num = 85;

        // Conditional Statements
        System.out.println("Conditional Statements:");
        if (num >= 90) {
            System.out.println("Grade: A");
        } else if (num >= 75) {
            System.out.println("Grade: B");
        } else if (num >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        String result = (num >= 33) ? "Pass" : "Fail";
        System.out.println("Marks = " + num + " => Result: " + result);

        // Traditional Switch Statement
        int day = 3;
        System.out.println("\nTraditional Switch Statement:");
        switch (day) {
            case 1:
                System.out.println("Day 1: Monday");
                break;
            case 2:
                System.out.println("Day 2: Tuesday");
                break;
            case 3:
                System.out.println("Day 3: Wednesday");
                break;
            case 4:
                System.out.println("Day 4: Thursday");
                break;
            case 5:
                System.out.println("Day 5: Friday");
                break;
            default:
                System.out.println("Weekend or Invalid Day");
        }

        // Enhanced Switch (Java 14+)
        System.out.println("\nEnhanced Switch (Java 14+ style):");
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "Invalid Day";
        };
        System.out.println("Day " + day + ": " + dayName);
    }
}