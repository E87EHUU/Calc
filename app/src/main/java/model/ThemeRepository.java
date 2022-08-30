package model;

import java.util.List;

public interface ThemeRepository {

    Theme getSaveTheme();

    void saveTheme (Theme theme);

    List<Theme> getALL();
}
