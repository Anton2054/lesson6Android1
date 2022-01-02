package com.example.lesson6android1.сlient;

import com.example.lesson6android1.data.GameModel;

import java.util.ArrayList;

public class GameClient {
    public static ArrayList<GameModel> gameList = new ArrayList<>();

    public static ArrayList<GameModel> getGameList() {
        gameList.add(new GameModel("Вопрос 1", "56 + 56 = ?", "112", "150", "66", "90"));
        gameList.add(new GameModel("Вопрос 2", "Кто менеджер в GeekTech?", "Кудайберген", "Бека", "Бека Байке", "Алымбек"));
        gameList.add(new GameModel("Вопрос 3", "кто из них был основателем FaceBook?, ", "Марк Цукерберг", "Илон Маск", "Билл Гейтс", "Сергей Брин"));
        gameList.add(new GameModel("Вопрос 4", "кто первый совершил полёт в космос?", "Юрий Алексеевич Гагарин   ", "Джонн Гленн", "Деннис Тито", "Сергей Титов"));
        gameList.add(new GameModel("Вопрос 5", "25*35=?", "875", "415", "420", "250"));
        gameList.add(new GameModel("Вопрос 6", "кто впервые открыл Америку?", "Христофор Колумб", "васко да Гама", "Альберт Эйнштейн", "Джек Воробей"));
        gameList.add(new GameModel("Вопрос 7", "Создатель биткоина ", "Сатоши Накамото", "Виталик Бутерин", "Эндрю Карнеги", "Джей Гульд"));
        gameList.add(new GameModel("Вопрос 8", "кем был Билл Гейтс?", "предприниматель", "актер", "певец", "такого человека не существует"));
        gameList.add(new GameModel("Вопрос 9", "создатель тик тока", "Чжан Имин", "Эндрю макколум", "Владимир ПУТИН", "Алмазбек Атамбаев "));
        gameList.add(new GameModel("Вопрос 10","как перводится слово HOTDOG", "горячая собака", "готовая собака", "злая собака", "милый пёсик"));
        return gameList;
    }

}
