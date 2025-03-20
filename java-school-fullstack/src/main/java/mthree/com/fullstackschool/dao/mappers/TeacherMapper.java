package mthree.com.fullstackschool.dao.mappers;

import mthree.com.fullstackschool.model.Teacher;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherMapper implements RowMapper<Teacher> {
    @Override
    public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
        //YOUR CODE STARTS HERE

        Teacher tr = new Teacher();
        tr.setTeacherId(rs.getInt(("tid")));
        tr.setTeacherFName(rs.getString("tFName"));
        tr.setTeacherLName(rs.getString("tLName"));
        tr.setDept("dept");

        return tr;

        //YOUR CODE ENDS HERE
    }
}
