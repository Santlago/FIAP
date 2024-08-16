using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace _2TDSPK.Migrations
{
    /// <inheritdoc />
    public partial class v1Cursos : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "2TDSPK_Tb_Cursos",
                columns: table => new
                {
                    CursoId = table.Column<int>(type: "NUMBER(10)", nullable: false)
                        .Annotation("Oracle:Identity", "START WITH 1 INCREMENT BY 1"),
                    Nome = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_2TDSPK_Tb_Cursos", x => x.CursoId);
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "2TDSPK_Tb_Cursos");
        }
    }
}
