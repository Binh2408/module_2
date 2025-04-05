package ss1_introduction_to_java.bai_tap.bai_3_doc_so_thanh_chu;

import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
//        System.out.println(number % 10);
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            if (tens == 1) {
                switch (ones) {
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                    default:
                        System.out.println("Ten");
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        System.out.println("Twenty");
                        break;
                    case 3:
                        System.out.println("Thirty");
                        break;
                    case 4:
                        System.out.println("Forty");
                        break;
                    case 5:
                        System.out.println("Fifty");
                        break;
                    case 6:
                        System.out.println("Sixty");
                        break;
                    case 7:
                        System.out.println("Seventy");
                        break;
                    case 8:
                        System.out.println("Eighty");
                        break;
                    case 9:
                        System.out.println("Ninety");
                        break;
                }

                if (ones != 0) {
                    System.out.println(" ");
                    switch (ones) {
                        case 1:
                            System.out.print("One");
                            break;
                        case 2:
                            System.out.print("Two");
                            break;
                        case 3:
                            System.out.print("Three");
                            break;
                        case 4:
                            System.out.print("Four");
                            break;
                        case 5:
                            System.out.print("Five");
                            break;
                        case 6:
                            System.out.print("Six");
                            break;
                        case 7:
                            System.out.print("Seven");
                            break;
                        case 8:
                            System.out.print("Eight");
                            break;
                        case 9:
                            System.out.print("Nine");
                            break;
                    }
                }
                System.out.println();
            }
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;
            int tens = remainder / 10;
            int ones = remainder % 10;
            // Hàng trăm
            switch (hundreds) {
                case 1:
                    System.out.print("One hundred");
                    break;
                case 2:
                    System.out.print("Two hundred");
                    break;
                case 3:
                    System.out.print("Three hundred");
                    break;
                case 4:
                    System.out.print("Four hundred");
                    break;
                case 5:
                    System.out.print("Five hundred");
                    break;
                case 6:
                    System.out.print("Six hundred");
                    break;
                case 7:
                    System.out.print("Seven hundred");
                    break;
                case 8:
                    System.out.print("Eight hundred");
                    break;
                case 9:
                    System.out.print("Nine hundred");
                    break;
            }

            if (remainder != 0) {
                System.out.print(" and ");
                if (remainder < 10) {
                    switch (ones) {
                        case 1:
                            System.out.print("One");
                            break;
                        case 2:
                            System.out.print("Two");
                            break;
                        case 3:
                            System.out.print("Three");
                            break;
                        case 4:
                            System.out.print("Four");
                            break;
                        case 5:
                            System.out.print("Five");
                            break;
                        case 6:
                            System.out.print("Six");
                            break;
                        case 7:
                            System.out.print("Seven");
                            break;
                        case 8:
                            System.out.print("Eight");
                            break;
                        case 9:
                            System.out.print("Nine");
                            break;
                        default:
                            System.out.print("Zero");
                            break;
                    }
                } else if (remainder < 20) {
                    switch (remainder) {
                        case 10:
                            System.out.print("Ten");
                            break;
                        case 11:
                            System.out.print("Eleven");
                            break;
                        case 12:
                            System.out.print("Twelve");
                            break;
                        case 13:
                            System.out.print("Thirteen");
                            break;
                        case 14:
                            System.out.print("Fourteen");
                            break;
                        case 15:
                            System.out.print("Fifteen");
                            break;
                        case 16:
                            System.out.print("Sixteen");
                            break;
                        case 17:
                            System.out.print("Seventeen");
                            break;
                        case 18:
                            System.out.print("Eighteen");
                            break;
                        case 19:
                            System.out.print("Nineteen");
                            break;
                    }
                } else {
                    switch (tens) {
                        case 2:
                            System.out.print("Twenty");
                            break;
                        case 3:
                            System.out.print("Thirty");
                            break;
                        case 4:
                            System.out.print("Forty");
                            break;
                        case 5:
                            System.out.print("Fifty");
                            break;
                        case 6:
                            System.out.print("Sixty");
                            break;
                        case 7:
                            System.out.print("Seventy");
                            break;
                        case 8:
                            System.out.print("Eighty");
                            break;
                        case 9:
                            System.out.print("Ninety");
                            break;
                    }

                    if (ones != 0) {
                        System.out.print(" ");
                        switch (ones) {
                            case 1:
                                System.out.print("One");
                                break;
                            case 2:
                                System.out.print("Two");
                                break;
                            case 3:
                                System.out.print("Three");
                                break;
                            case 4:
                                System.out.print("Four");
                                break;
                            case 5:
                                System.out.print("Five");
                                break;
                            case 6:
                                System.out.print("Six");
                                break;
                            case 7:
                                System.out.print("Seven");
                                break;
                            case 8:
                                System.out.print("Eight");
                                break;
                            case 9:
                                System.out.print("Nine");
                                break;
                        }
                    }
                }
            }
            System.out.println(); // Xuống dòng
        
        }
    }
}
