[![Java CI with Gradle](https://github.com/ivan3035789/UiSelenium-SelenideJavaCore/actions/workflows/gradle.yml/badge.svg)](https://github.com/ivan3035789/UiSelenium-SelenideJavaCore/actions/workflows/gradle.yml)

## _Задание 1 - Selenid/Selenium_

<span style="color: blue">Ссылка на ресурс</span>- [https://www.demoblaze.com/](https://www.demoblaze.com/)

## _Кейс 1:_

```gradle
- Проверить цену на карточке товара с ценой добавленного продукта в корзину:
1. Зарегистрировать пользователя
2. Выбрать продукт из категории
3. Добавить в корзину
4. Сравнить цену товара с карточки и в корзине 
```

&#10071;В реализации необходимо использовать **PageObject**</span>

Запуск тестов:
```shell
./gradlew test
```

Отчет Allure:
```shell
allure serve build/allure-results
```

## Перечень используемых инструментов для автоматизации:

| **_Инструмент_**    | **_Описание_**                                                     |
|---------------------|--------------------------------------------------------------------|
| **_java_**          | язык програмирования для написания тестов                          |
| **_selenid_**       | оболочка для Selenium WebDriver, создан специально для UI тестов   |
| **_allure_**        | инструмент для создания отчётов о тестировании                     |
| **_junit_**         | библиотека для тестирования                                        |
| **_lombok_**        | библиотека Java, которая позволяет сократить объём шаблонного кода |
| **_Git_**           | система контроля версий                                            |
| **_GitHub_**        | для хранения тестов                                                |
| **_GitHub Action_** | CI для непрерывной интеграции                                      |
