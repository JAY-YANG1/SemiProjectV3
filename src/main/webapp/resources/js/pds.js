
// list
$('#newpdsbtn').on('click', function () {
    location.href = '/pds/write';
});

// write
$('#newpds').on('click', function () {
    if ($('#title').val() == '') {
        alert('');
    } else if($('#contents').val() == '') {
        alert('');
    } else if (grecaptcha.getResponse() == '') {
        alert('');
    } else {
        const frm = $('#pdsfrm');
        frm.attr('method', 'post');
        frm.attr('action', '/pds/write');
        frm.submit();
    }
});

// recommend
$('#pdthumbtn').on('click', function () {
    location.href = '/pds/recommd?pno=' + $('#pno').val();
});


// prevbtn
$('#pdprvbtn').on('click', function () {
    location.href = '/pds/prev?pno=' + $('#pno').val();
});

// nextbtn
$('#pdnxtbtn').on('click', function () {
    location.href = '/pds/next?pno=' + $('#pno').val();
});

// rmvntb
$('#pdrmvbtn').on('click', function () {
    location.href = '/pds/pdrmv?pno=' + $('#pno').val();
});