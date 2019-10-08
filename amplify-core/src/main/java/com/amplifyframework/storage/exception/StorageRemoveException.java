/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.storage.exception;

import com.amplifyframework.core.exception.AmplifyException;

/**
 * Exception encountered in remove API of Storage category
 */
public class StorageRemoveException extends AmplifyException {

    /**
     * Creates a new StorageRemoveException with the specified message, and root
     * cause.
     *
     * @param message An error message describing why this exception was thrown.
     * @param t The underlying cause of this exception.
     */
    public StorageRemoveException(final String message, final Throwable t) {
        super(message, t);
    }

    /**
     * Creates a new StorageRemoveException with the specified message.
     *
     * @param message An error message describing why this exception was thrown.
     */
    public StorageRemoveException(final String message) {
        super(message);
    }

    /**
     * Creates a new StorageRemoveException with the root cause.
     *
     * @param throwable The underlying cause of this exception.
     */
    public StorageRemoveException(final Throwable throwable) {
        super(throwable);
    }
}
