package com.hkd.Controller;

import com.hkd.Mapper.StudentMapper;
import com.hkd.Pojo.RetMessage;
import com.hkd.Pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jhj
 * @data 2021/8/1 - 23:59
 */
@RestController
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    RetMessage retMessage;
    List<Student> ls=new ArrayList<>();
    @RequestMapping(value="/insertStudent.do")
    public RetMessage insertStudent(Student student){
        //返回页面时 ajax中success要再次重定向
        try{studentMapper.insertStudent(student);}catch (Exception e){
            retMessage.setRet_code("1111");
            return retMessage;
        }
        retMessage.setRet_code("0000");
       return retMessage;
    }
    @RequestMapping(value = "/getStudent.do")
    public List<Student> getStudent(){
        try{
            ls=studentMapper.getStudent();
        }catch (Exception e){
            ls=null;
            return ls;
        }
        return ls;
    }
    @RequestMapping(value = "/insertTxt.do")
    public void insertTxt(String txt, HttpSession session){
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
            fwriter = new FileWriter(session.getServletContext().getRealPath("/") + "text/1.txt");
            fwriter.write(txt);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
