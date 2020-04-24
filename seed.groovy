job('simpleTrigger') {
  parameters {
    stringParam('Object', 'Undescribed', 'This parameter describes a type of Object');
  }
  steps {
    shell('echo $JOB_NAME $BULD_NUMBER')
    shell('echo $Object')
  }
  publishers {
    downstream( 'simpleJobWithParameter', 'SUCCESS' )
  }
}
