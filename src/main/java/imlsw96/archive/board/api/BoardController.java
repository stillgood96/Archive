package imlsw96.archive.board.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

  @GetMapping("/boards")
  public ResponseEntity<?> getBoards() {
    return ResponseEntity.ok("ok");
  }
}
