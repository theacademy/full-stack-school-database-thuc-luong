package mthree.com.fullstackschool.dao.mappers;

import mthree.com.fullstackschool.model.Student;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        //YOUR CODE STARTS HERE

        Student std = new Student();
        std.setStudentId(rs.getInt("sid"));
        std.setStudentFirstName(rs.getString("fName"));
        std.setStudentLastName(rs.getString("lName"));

        return std;

        //YOUR CODE ENDS HERE
    }
}
