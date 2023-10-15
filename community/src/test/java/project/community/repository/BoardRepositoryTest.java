//package project.community.repository;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.transaction.annotation.Transactional;
//import project.community.entity.Board;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//
///**
// * @author jeonghwanlee
// * @date 2023-10-15
// */
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class BoardRepositoryTest {
//
//    @Autowired BoardRepository boardRepository;
//
//    @Test
//    @DisplayName("게시판 생성 테스트")
//    public void testBoard() {
//        Board board = new Board("test");
//        Board savedBoard = boardRepository.save(board);
//
//        Board findBoard = boardRepository.findById(savedBoard.getId())
//                .orElseThrow(IllegalArgumentException::new);
//
//        assertThat(findBoard.getId()).isEqualTo(board.getId());
//        assertThat(findBoard.getTitle()).isEqualTo(board.getTitle());
//        assertThat(findBoard).isEqualTo(board);
//    }
//}