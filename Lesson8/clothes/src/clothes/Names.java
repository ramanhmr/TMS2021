package clothes;

import lombok.Getter;

@Getter
public enum Names {
    IVAN("Иван"), ARKADY("Аркадий"), FEDOR("Фёдор"), SLAVA("Вячеслав"), YAN("Ян");

    private final String name;

    Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
