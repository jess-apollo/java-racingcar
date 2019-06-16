package edu.nextstep.stepone;

import java.util.List;
import java.util.Scanner;

/**
 * author       : gwonbyeong-yun <sksggg123>
 * ------------------------------------------
 * | email        : sksggg123               |
 * | github       : github.com/sksggg123    |
 * | blog         : sksggg123.github.io     |
 * ------------------------------------------
 * project      : java-racingcar
 * create date  : 2019-06-14 14:29
 */
public class CalculatorApplication {

    private Operator operator = new Operator();
    private Validation validation = new Validation();

    private List<String> letter;
    private static int firstIndex = 0;
    private static int lastIndex = 2;
    private static int totalNumber = 0;

    public static void main(String[] args) {
        CalculatorApplication calculator = new CalculatorApplication();

        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();
        sc.close();

        System.out.println(calculator.start(inputData));
    }

    public int start(String inputData) {

        if (this.validation.isBlank(inputData)) {
            this.letter = this.validation.splitSpace(inputData);
        }

        totalNumber = this.validation.convertInt(this.letter.get(0));

        for (int i = firstIndex; i < this.letter.size() - 2 ; i += lastIndex) {
            OperatorType type = OperatorType.typeCheck(this.letter.get(i+1));
            String oper = type.getType();

            int second = this.validation.convertInt(this.letter.get(i+2));
            totalNumber = this.operator.doOperation(oper, totalNumber, second);
        }

        return totalNumber;
    }

}
