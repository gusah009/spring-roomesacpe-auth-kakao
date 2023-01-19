package nextstep.theme;

import nextstep.exception.BusinessException;
import nextstep.exception.ErrorCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeService {

    private ThemeDao themeDao;

    public ThemeService(ThemeDao themeDao) {
        this.themeDao = themeDao;
    }

    public long create(ThemeRequest themeRequest) {
        return themeDao.save(themeRequest.toEntity());
    }

    public List<Theme> findAll() {
        return themeDao.findAll();
    }

    public void delete(long id) {
        themeDao.findById(id)
                .orElseThrow(() -> new BusinessException(ErrorCode.THEME_NOT_FOUND));

        themeDao.delete(id);
    }
}
