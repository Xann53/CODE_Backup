<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Prescription.aspx.cs" Inherits="Pediatric_Clinical_System.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            position: absolute;
            left: 148px;
            top: 17px;
            width: 342px;
            height: 41px;
        }
        .auto-style2 {
            position: absolute;
            left: 376px;
            top: 26px;
            height: 686px;
            width: 639px;
        }
        .auto-style3 {
            position: absolute;
            left: 148px;
            top: 71px;
            width: 342px;
            height: 19px;
            font-family: "Arial Narrow";
        }
        .auto-style5 {
            position: absolute;
            left: 57px;
            top: 107px;
            width: 148px;
            height: 22px;
            font-family: "Arial Narrow";
            right: 434px;
        }
        .auto-style6 {
            position: absolute;
            left: 218px;
            top: 107px;
            width: 154px;
            height: 22px;
            font-family: "Arial Narrow";
        }
        .auto-style7 {
            position: absolute;
            left: 386px;
            top: 107px;
            width: 239px;
            height: 22px;
            font-family: "Arial Narrow";
        }
        .auto-style10 {
            position: absolute;
            left: 37px;
            top: 160px;
            width: 305px;
            height: 111px;
            font-family: "Arial Narrow";
            right: 295px;
        }
        .auto-style11 {
            position: absolute;
            left: 37px;
            top: 289px;
            width: 565px;
            height: 342px;
            font-family: "Arial Narrow";
            right: 35px;
        }
        .auto-style12 {
            position: absolute;
            left: 370px;
            top: 643px;
            width: 230px;
            height: 31px;
            font-family: "Arial Narrow";
        }
        .auto-style13 {
            position: absolute;
            left: 37px;
            top: 643px;
            width: 319px;
            height: 31px;
            font-family: "Arial Narrow";
        }
    </style>
</head>
<body style="height: 793px; width: 1368px">
    <form id="form1" runat="server" class="auto-style2" style="background-color: #FCE8DC">
        <div id="Header1" class="auto-style1" style="text-align: center; font-family: 'Arial Narrow';">
            PEDIATRIC CLINICAL SYSTEM<br />
            PERPETUAL SUCCOUR GENERAL HOSPITAL</div>
        <div id="Header2" class="auto-style3" style="text-align: center; font-size: 14px;">
            PRESCRIPTION</div>
        <div id="Content3" class="auto-style7" style="text-align: justify; font-size: 12px; vertical-align: 40%; font-family: Arial;">
            Date&nbsp;&nbsp;&nbsp;
            <asp:DropDownList ID="DropDownList1" runat="server" Font-Size="8pt" Height="16px" Width="47px">
                <asp:ListItem>JAN</asp:ListItem>
            </asp:DropDownList>
            <asp:DropDownList ID="DropDownList3" runat="server" Font-Size="8pt" Height="19px" Width="37px">
                <asp:ListItem>01</asp:ListItem>
            </asp:DropDownList>
            <asp:DropDownList ID="DropDownList2" runat="server" Font-Size="8pt" Height="16px" Width="51px">
                <asp:ListItem>2020</asp:ListItem>
            </asp:DropDownList>
        </div>
        <div id="Content4" class="auto-style10" style="border: 0.5px solid #808080; font-size: 12px; font-family: Arial; vertical-align: 40%;">
            &nbsp;&nbsp;&nbsp; Patient Info<br />
            <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Patient Code&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox5" runat="server" Width="95px"></asp:TextBox>
            <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Patient Name&nbsp;&nbsp;
            <asp:TextBox ID="TextBox6" runat="server" Width="173px"></asp:TextBox>
            <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Age&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox7" runat="server" Width="39px"></asp:TextBox>
        </div>
        <div id="Content2" class="auto-style6" style="text-align: justify; font-size: 12px; vertical-align: 40%; font-family: Arial;">
            Consultation No.&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox3" runat="server" Width="33px"></asp:TextBox>
        </div>
        <div id="Content1" class="auto-style5" style="text-align: justify; font-size: 12px; vertical-align: 40%; font-family: Arial;">
            Prescription No.&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox4" runat="server" Width="33px"></asp:TextBox>
        </div>
        <div id="Content5" class="auto-style11" style="border: 0.5px solid #808080; font-size: 12px; font-family: Arial; vertical-align: 40%;">
            &nbsp;&nbsp;&nbsp; Medicine to Prescribe<br />
            <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Medicine Code&nbsp;&nbsp;
            <asp:TextBox ID="TextBox8" runat="server" Width="129px"></asp:TextBox>
            <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Quantity&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox9" runat="server" Width="38px"></asp:TextBox>
            <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Remarks&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox10" runat="server" Width="415px"></asp:TextBox>
            <br />
            <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox11" runat="server" Height="203px" ReadOnly="True" Width="510px"></asp:TextBox>
        </div>
        <div id="Content6" class="auto-style13" style="text-align: justify; font-size: 12px; font-family: Arial; vertical-align: 40%;">
            Prepared By:&nbsp;&nbsp;&nbsp; <asp:TextBox ID="TextBox12" runat="server" Width="219px"></asp:TextBox>
        </div>
        <div id="Content7" class="auto-style12" style="text-align: justify; font-size: 12px; font-family: Arial;">
            <asp:Button ID="SaveButton0" runat="server" Height="28px" Text="Save" Width="93px" />
&nbsp;&nbsp;&nbsp;
            <asp:Button ID="ClearButton0" runat="server" Height="28px" Text="Clear" Width="93px" />
        </div>
    </form>
</body>
</html>
