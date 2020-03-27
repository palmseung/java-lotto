package lotto;

import java.util.Objects;

public class Money {
    private static final Long MONEY_TO_BUY_ONE_LOTTO = 1000L;

    private Long money;

    public Money(Long money) {
        validateNegative(money);
        validateEnoughToBuyLotto(money);
        this.money = money;
    }

    private void validateNegative(Long money) {
        if (isNegative(money)) {
            throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
        }
    }

    private boolean isNegative(Long money) {
        return money < 0;
    }

    private void validateEnoughToBuyLotto(Long money) {
        if (isLessThanOneThousand(money)) {
            throw new IllegalArgumentException("1000원 미만의 금액은 입력할 수 없습니다.");
        }
    }

    private boolean isLessThanOneThousand(Long money) {
        return money < MONEY_TO_BUY_ONE_LOTTO;
    }

    public long findLottoCountToBuy() {
        return this.money / MONEY_TO_BUY_ONE_LOTTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return Objects.equals(money, money1.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }
}