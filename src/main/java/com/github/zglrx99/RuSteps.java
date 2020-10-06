package com.github.zglrx99;

import io.cucumber.java.ru.Пусть;

public class RuSteps {

    @Пусть("(тест )с опциональным текстом")
    public void cucumberExpressionWithOptional() {
    }

    @Пусть("тест без опционального текста")
    @Пусть("без опционального текста")
    public void cucumberExpressionWithoutOptional() {
    }
}
