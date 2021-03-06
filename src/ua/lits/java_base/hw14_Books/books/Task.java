package ua.lits.java_base.hw14_Books.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task {
//    2. Створити класс Task який буде мати такі поля:
//    title,
//    creation date,
//    type (READING, NEW, DONE),
//    tags(List).


    private String title;
    String creationDate;
    TypeEnum type;
    private List<String> tags = new ArrayList<>();

    public Task(String title, String creationDate, TypeEnum type) {
        this.title = title;
        this.creationDate = creationDate;
        this.type = type;
    }
    public Task(String title, String creationDate, TypeEnum type, List<String> tags) {
        this.title = title;
        this.creationDate = creationDate;
        this.type = type;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return title.equals(task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
