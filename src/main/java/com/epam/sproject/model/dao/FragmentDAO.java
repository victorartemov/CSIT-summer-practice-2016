package model.dao;

import model.entity.Fragment;
import java.io.IOException;

/**
 * Created by Гога on 19.07.2016.
 */
public interface FragmentDAO extends DAO<Fragment> {
    public Fragment getFragmentById(Long id) throws IOException;
}
