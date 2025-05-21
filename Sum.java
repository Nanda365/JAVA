class Sum {
    public static void main(String[] args) {
        int sum = 0;

        try {
            for (int i = 0; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num;
            }
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter only integers.");
        }
    }
}
