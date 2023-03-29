$(document).ready(function() {
	$('#exceldownload').click(function() {
		const link = document.createElement('a');
		const id = document.getElementById('id').value;
		const today = new Date();

		let year = today.getFullYear(); // 년도
		let month = today.getMonth() + 1;  // 월
		let date = today.getDate();  // 날짜

		link.download = year + month + date + id + ".xlsx";
		link.href = 'data:, ' + $('#exceldownload').text();
		link.click();
	});
});