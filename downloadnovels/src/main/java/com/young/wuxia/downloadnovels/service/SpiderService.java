package com.young.wuxia.downloadnovels.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by bin.yao on 2017/4/20.
 */
@Service
public class SpiderService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveBook(String bookName, String bookUrl) {
        jdbcTemplate.update("insert into spider_book(book_name, book_url) values(?, ?)", bookName, bookUrl);
    }

    public void saveChapter(String chapterName, String chapterUrl, String bookUrl) {
        jdbcTemplate.update("insert into spider_chapter(chapter_name, chapter_url, book_url) values(?, ?, ?)", chapterName, chapterUrl, bookUrl);
    }

    public void saveChapterText(String chapterText, String chapterUrl) {
        jdbcTemplate.update("insert into spider_chapter_text(chapter_text, chapter_url) values(?, ?)", chapterText, chapterUrl);
    }
}
