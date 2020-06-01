package com.study.board;


public class BoardServiceImpl implements BoardService{
    private BoardDAO boardDAO;

    public BoardServiceImpl(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }
}
