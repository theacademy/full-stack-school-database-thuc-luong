package mthree.com.fullstackschool.dao.mappers;

import mthree.com.fullstackschool.model.Course;
import mthree.com.fullstackschool.model.Student;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseMapper implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        //YOUR CODE STARTS HERE

        Course cr = new Course();
        cr.setCourseId(rs.getInt("cid"));
        cr.setCourseDesc(rs.getString("courseDesc"));
        cr.setCourseName(rs.getString("courseCode"));
        cr.setTeacherId(rs.getInt("teacherId"));

        return cr;

        //YOUR CODE ENDS HERE
    }
}
