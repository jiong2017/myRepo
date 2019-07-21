package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ReadingListController {

    @Resource
    private BookRepo bookRepo;

    @RequestMapping(value="/{reader}", method= RequestMethod.GET)
    public String readersBooks(
        @PathVariable("reader") String reader,
            Model model) {
        List<Book> readingList = bookRepo.findByReader(reader);
        if (CollectionUtils.isNotEmpty(readingList)) {
            model.addAttribute("books", readingList);
        }
//        else {
//            readingList = new ArrayList<>();
//            Book book = new Book();
//            readingList.add(book);
//            book.setId(1L);
//            book.setReader("reader1");
//            book.setAuthor("author1");
//            book.setDescription("description1");
//            book.setTitle("title1");
//            book.setIsbn("isbn1");
//        }
        return "readingList";
    }

    @RequestMapping(value="/{reader}", method= RequestMethod.POST)
    public String addToReadingList(
            @PathVariable("reader") String reader,
            Book book) {
        book.setReader(reader);
        bookRepo.save(book);
        return "redirect:/{reader}";
    }
}
