package progres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import progres.model.Book;
import progres.repository.BookRepo;

@Controller
@RequestMapping("/book/")
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllBooks() {
        return ResponseEntity.ok(bookRepo.findAll());
    }

    @GetMapping("/getById/{bookId}")
    public ResponseEntity<?> getBookById(@PathVariable Long bookId) {
        return ResponseEntity.ok(bookRepo.findById(bookId));
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBook (@RequestBody Book book){
        bookRepo.save(book);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId) {
        bookRepo.deleteById(bookId);
        return ResponseEntity.ok(HttpStatus.OK);
    }

//    @PutMapping("/update/{bookId}")
//    public ResponseEntity<?> updateBook(@PathVariable Long bookId, @RequestBody Book book) {
//        bookRepo.save();
//        return ResponseEntity.ok(HttpStatus.OK);
//    }


}


