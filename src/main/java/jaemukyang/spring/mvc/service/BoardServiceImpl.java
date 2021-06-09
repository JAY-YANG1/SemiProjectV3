package jaemukyang.spring.mvc.service;

import jaemukyang.spring.mvc.dao.BoardDAO;
import jaemukyang.spring.mvc.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bsrv")
public class BoardServiceImpl implements BoardService{

    @Autowired private BoardDAO bdao;

    @Override
    public boolean newBoard(Board b) {
        return false;
    }

    @Override
    public boolean modifyBoard(Board b) {
        return false;
    }

    @Override
    public boolean removeBoard(String bdno) {
        return false;
    }

    @Override
    public List<Board> readBoard(String cp) {
        // (30 * (n-1))
        int snum = 30 * (Integer.parseInt(cp)-1);
        return bdao.selectBoard(snum);
    }

    @Override
    public List<Board> readBoard(String cp, String ftype, String fkey) {
        return null;
    }

    @Override
    public Board readOneBoard(String bdno) {
        return null;
    }

    @Override
    public int countBoard() {
        return 0;
    }

    @Override
    public int countBoard(String ftype, String fkey) {
        return 0;
    }

    @Override
    public boolean viewCountBoard(String bdno) {
        return false;
    }
}
