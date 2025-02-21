package org.example.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class BoardColumnEntity {

    private Long id;
    private String name;
    private int order;
    private BoardColumnKindEnum kind;
    private BoardEntity board = new BoardEntity();
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<CardEntity> cards = new ArrayList<>();

    public BoardColumnKindEnum getKind() {
        return kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(BoardColumnKindEnum kind) {
        this.kind = kind;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }

    public int getOrder() {
        return this.order;
    }

    public void setBoard(BoardEntity entity) {
        this.board = entity;
    }

    public List<CardEntity>  getCards() {
        return this.cards;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BoardEntity getBoard() {
        return this.board;
    }
}