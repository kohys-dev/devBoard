package com.study99.board.service;

import com.study99.board.entity.Board;
import com.study99.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(Board board){
        boardRepository.save(board);
    }

    public Page<Board> boardList(Pageable pageable){
        return boardRepository.findAll(pageable);
    }

    public Board getboardView(@RequestParam("id") Integer id){
        return boardRepository.findById(id).get();
    }

    public void delete(@RequestParam("id") Integer id){
        boardRepository.deleteById(id);
    }

//    public void modify(@RequestParam("id") Integer id){
//
//    }
}
