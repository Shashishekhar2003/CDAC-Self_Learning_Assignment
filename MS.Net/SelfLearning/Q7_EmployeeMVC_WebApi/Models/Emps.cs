using System.ComponentModel.DataAnnotations;

namespace EmployeeMVC.Models
{
    public class Emps
    {
        [Key]
        public int EmpsId { get; set; }

        [Required]
        public string Name { get; set; }

        [Required]
        public string Dept { get; set; }
    }
}