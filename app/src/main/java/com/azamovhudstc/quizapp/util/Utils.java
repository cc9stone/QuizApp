package com.azamovhudstc.quizapp.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;


import com.azamovhudstc.quizapp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {



    public static String formatDate(long time){
        @SuppressLint({"NewApi", "LocalSuppress"}) SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("4*3","12");
        questions.put("5*12","60");
        questions.put("127-45","82");
        questions.put("y=−6x+8","78");
        questions.put("43*27","1161");
        questions.put("175/5","35");
        questions.put("20/2(5+5) ","100");
        questions.put("134/2+(12*4)","115");
        questions.put("56*31","1736");
        questions.put("1748/76","23");
        questions.put("3456/432","8");
        questions.put("23/77","1771");
        questions.put("32/4","8");
        questions.put("2892/723","4");
        questions.put("55/5","11");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Ершалаим",false);
        answer1.put("Москва",true);
        answer1.put("Петроград",false);
        answer1.put("Ленинград",false);
        questions.put("Где происходит действие романа М. А. Булгакова «Мистер и Маргарита»?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("А. А. Ахматова ",false);
        answer2.put("М. И. Цветаева",false);
        answer2.put("С. А. Есенин",true);
        answer2.put("А. А. Блок",false);
        questions.put("Кто из русских поэтов является автором поэтического цикла «Персидские мотивы»?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Символизм",true);
        answer3.put("Акмеизм",false);
        answer3.put("Классицизм",false);
        answer3.put("Имажинизм",false);
        questions.put("Укажите, представителем какого литературного направления был А. А. Блок?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("«Старуха Изергиль»",true);
        answer4.put("«Большой шлем»",false);
        answer4.put("«Качели»",false);
        answer4.put("«Гамбринус»",false);
        questions.put("Героем какого произведения является Данко?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("встреча двенадцати с буржуем и псом на перекрестке",false);
        answer5.put("шествие красногвардейцев по улицам Петрограда",false);
        answer5.put("появление «товарища-попа»",false);
        answer5.put("убийство Катьки Петрухой",true);
        questions.put("Какой эпизод является кульминацией поэмы А. А. Блока «Двенадцать»?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("А. А. Ахматова",false);
        answer6.put("В. В. Маяковский",true);
        answer6.put("А. А. Блок",false);
        answer6.put("С. А. Есенин",false);
        questions.put("Назовите поэта, являющегося футуристом.",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("«Зоя»",false);
        answer7.put("«Ленинградская поэма»",false);
        answer7.put("«Пулковский меридиан»",false);
        answer7.put("«Василий Теркин»",true);
        questions.put("Какое произведение называют «поэтической энциклопедией Великой Отечественной войны»?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("А. И. Куприн",false);
        answer8.put("М. Горький",true);
        answer8.put("В. В. Маяковский",false);
        answer8.put("А. А. Фадеев",false);
        questions.put("Укажите, кто из писателей XX в. похоронен у Кремлевской стены.",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("«Челкаш»",false);
        answer9.put("«На дне»",true);
        answer9.put("«Старуха Изергиль»",false);
        answer9.put("«Мать»",false);
        questions.put("В каком произведении М. Горького поставлена проблема о двух типах гуманизма?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("«Живые и мертвые»",false);
        answer10.put("«Судьба человека»",false);
        answer10.put("«Русский характер»",false);
        answer10.put("«Василий Теркин»",true);
        questions.put("«Книга про бойца» является подзаголовком:",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("авантюрный роман",false);
        answer11.put("роман-эпопея",true);
        answer11.put("любовный роман",false);
        answer11.put("роман-путешествие",false);
        questions.put("Определите жанр «Тихого Дона» М. А. Шолохова.",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("М.А.Шолохов",false);
        answer12.put("И. А. Бунин",true);
        answer12.put("Б. Л. Пастернак",false);
        answer12.put("А. И. Солженицын",false);
        questions.put("Кто из перечисленных русских писателей стал первым лауреатом Нобелевской премии?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("3. Н. Гиппиус",false);
        answer13.put("В. Я. Брюсов",false);
        answer13.put("А. А. Блок",true);
        answer13.put("Ф. К. Сологуб",false);
        questions.put("Назовите поэта, являющегося младосимволистом.",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("А. П. Чехова", false);
        answer14.put("М. Горького",true);
        answer14.put("В. В. Маяковского",false);
        answer14.put("С. А. Есенина",false);
        questions.put("Какого писателя XX в. называли «Буревестником революции»?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Л. Н. Толстой",true);
        answer15.put("А. Т. Твардовский",false);
        answer15.put("А. С. Пушкин",false);
        answer15.put("В. В. Путин",false);
        questions.put("Войну и мир написал:",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("3",false);
        answer1.put("6",false);
        answer1.put("12",true);
        answer1.put("1",false);
        questions.put("4*3 ?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("60",true);
        answer2.put("12",false);
        answer2.put("53",false);
        answer2.put("14",false);
        questions.put("5*12 ?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("116",false);
        answer3.put("115",true);
        answer3.put("112",false);
        answer3.put("113",false);
        questions.put("134/2+(12*4) ?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        questions.put("2892/723 ?",answer4);
        answer4.put("5",false);
        answer4.put("16",true);
        answer4.put("4",false);
        answer4.put("15",false);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("13",false);
        answer5.put("12",false);
        answer5.put("5",false);
        answer5.put("11",true);
        questions.put("55/5 ? ",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("101",false);
        answer6.put("131",false);
        answer6.put("100",true);
        answer6.put("112",false);
        questions.put("20/2(5+5) ?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("1161",true);
        answer7.put("123",false);
        answer7.put("1421",false);
        answer7.put("1612",false);
        questions.put("43*27?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("82",true);
        answer8.put("83",false);
        answer8.put("84",false);
        answer8.put("85",false);
        questions.put("127-45?",answer8);
//
        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("-4a + 22b",true);
        answer9.put("4a + 22b",false);
        answer9.put("28a + 30b",false);
        answer9.put("-28a + 30b",false);
        questions.put("12a + 26b -4b – 16a ?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put(" -1",false);
        answer10.put("2",true);
        answer10.put("–2",false);
        answer10.put("6",false);
        questions.put("(4 – 5) – (13 – 18 + 2) ?",answer10);


        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("25",false);
        answer12.put("24",false);
        answer12.put("17",false);
        answer12.put("13",true);
        questions.put("3 + 2 * (8 – 3)?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("7",false);
        answer13.put("5",false);
        answer13.put("9",true);
        answer13.put("8",false);
        questions.put("3^(4)÷3^(2) ?",answer13);



        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
