@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    void testGetAllStudents() {
        List<Student> list = studentService.getAllStudents();
        assertNotNull(list);
    }
}