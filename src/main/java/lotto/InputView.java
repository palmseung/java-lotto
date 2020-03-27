package lotto;

public class InputView {
    private String input;

    public InputView(String input) {
        validateNullOrEmpty(input);
        this.input = input;
    }

    private void validateNullOrEmpty(String input){
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("null 또는 공백은 입력할 수 없습니다.");
        }
    }
}