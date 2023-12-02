# SE_Lab5

<div dir="rtl">

# توضیحات

## مشکل با عدم تشخیص اعداد منفی در تست‌ها

توضیحات درباره‌ی مشکلاتی که در تست‌ها به وجود می‌آید به دلیل عدم تشخیص اعداد منفی توسط عبارات منظم (Regex) در
فایل‌های `calculator.feature` و `MyStepdefs.java`:

## مشکل اصلی

در تست شماره 2 با مقادیر `first: -1` و `second: 6`، عدم تشخیص اعداد منفی موجب اجرای نادرست تست شده است.

## راه حل

برای حل این مشکل، عبارات منظم مربوط به اعداد در فایل‌های `calculator.feature` و `MyStepdefs.java` باید به گونه‌ای تغییر
یابد که اعداد منفی نیز تشخیص داده شوند.

### تغییرات پیشنهادی

در فایل `calculator.feature`:
<div dir="ltr">

```gherkin
Given Two input values, <first> and <second>
When I add the two values
Then I expect the result <result>
```

</div>

در فایل `MyStepdefs.java`:

<div dir="ltr">

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
public void twoInputValuesAnd(int arg0,int arg1){
        }

@When("^I add the two values$")
public void iAddTheTwoValues(){
        }

@Then("^I expect the result (-?\\d+)$")
public void iExpectTheResult(int arg0){
        }
```

</div>


این تغییرات باعث تشخیص صحیح اعداد منفی در تست‌ها خواهد شد.

</div>
```

